package CiudadApp;


/**
* CiudadApp/CiudadHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ciudad.idl
* lunes 27 de mayo de 2019 01:02:01 PM COT
*/

abstract public class CiudadHelper
{
  private static String  _id = "IDL:CiudadApp/Ciudad:1.0";

  public static void insert (org.omg.CORBA.Any a, CiudadApp.Ciudad that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static CiudadApp.Ciudad extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      __typeCode = org.omg.CORBA.ORB.init ().create_interface_tc (CiudadApp.CiudadHelper.id (), "Ciudad");
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static CiudadApp.Ciudad read (org.omg.CORBA.portable.InputStream istream)
  {
    return narrow (istream.read_Object (_CiudadStub.class));
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, CiudadApp.Ciudad value)
  {
    ostream.write_Object ((org.omg.CORBA.Object) value);
  }

  public static CiudadApp.Ciudad narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CiudadApp.Ciudad)
      return (CiudadApp.Ciudad)obj;
    else if (!obj._is_a (id ()))
      throw new org.omg.CORBA.BAD_PARAM ();
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CiudadApp._CiudadStub stub = new CiudadApp._CiudadStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

  public static CiudadApp.Ciudad unchecked_narrow (org.omg.CORBA.Object obj)
  {
    if (obj == null)
      return null;
    else if (obj instanceof CiudadApp.Ciudad)
      return (CiudadApp.Ciudad)obj;
    else
    {
      org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate ();
      CiudadApp._CiudadStub stub = new CiudadApp._CiudadStub ();
      stub._set_delegate(delegate);
      return stub;
    }
  }

}