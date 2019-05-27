package ProductoApp;


/**
* ProductoApp/ProductoPOA.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from producto.idl
* lunes 27 de mayo de 2019 06:01:45 PM COT
*/

public abstract class ProductoPOA extends org.omg.PortableServer.Servant
 implements ProductoApp.ProductoOperations, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("insertarProducto", new java.lang.Integer (0));
    _methods.put ("actualizarProducto", new java.lang.Integer (1));
    _methods.put ("eliminarProducto", new java.lang.Integer (2));
    _methods.put ("shutdown", new java.lang.Integer (3));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {
       case 0:  // ProductoApp/Producto/insertarProducto
       {
         int pro_id_producto = in.read_long ();
         String pro_nombre = in.read_wstring ();
         String pro_estado = in.read_wstring ();
         boolean $result = false;
         $result = this.insertarProducto (pro_id_producto, pro_nombre, pro_estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 1:  // ProductoApp/Producto/actualizarProducto
       {
         int pro_id_producto = in.read_long ();
         String pro_nombre = in.read_wstring ();
         String pro_estado = in.read_wstring ();
         boolean $result = false;
         $result = this.actualizarProducto (pro_id_producto, pro_nombre, pro_estado);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 2:  // ProductoApp/Producto/eliminarProducto
       {
         int pro_id_producto = in.read_long ();
         boolean $result = false;
         $result = this.eliminarProducto (pro_id_producto);
         out = $rh.createReply();
         out.write_boolean ($result);
         break;
       }

       case 3:  // ProductoApp/Producto/shutdown
       {
         this.shutdown ();
         out = $rh.createReply();
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:ProductoApp/Producto:1.0"};

  public String[] _all_interfaces (org.omg.PortableServer.POA poa, byte[] objectId)
  {
    return (String[])__ids.clone ();
  }

  public Producto _this() 
  {
    return ProductoHelper.narrow(
    super._this_object());
  }

  public Producto _this(org.omg.CORBA.ORB orb) 
  {
    return ProductoHelper.narrow(
    super._this_object(orb));
  }


} // class ProductoPOA
