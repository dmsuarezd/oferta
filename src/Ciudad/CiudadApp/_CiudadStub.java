package CiudadApp;


/**
* CiudadApp/_CiudadStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ciudad.idl
* lunes 27 de mayo de 2019 01:02:01 PM COT
*/

public class _CiudadStub extends org.omg.CORBA.portable.ObjectImpl implements CiudadApp.Ciudad
{

  public boolean insertarCiudad (int ubi_id_ubicacion, String ubi_nombre, String ubi_estado)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("insertarCiudad", true);
                $out.write_long (ubi_id_ubicacion);
                $out.write_wstring (ubi_nombre);
                $out.write_wstring (ubi_estado);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return insertarCiudad (ubi_id_ubicacion, ubi_nombre, ubi_estado        );
            } finally {
                _releaseReply ($in);
            }
  } // insertarCiudad

  public boolean actualizarCiudad (int ubi_id_ubicacion, String ubi_nombre, String ubi_estado)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("actualizarCiudad", true);
                $out.write_long (ubi_id_ubicacion);
                $out.write_wstring (ubi_nombre);
                $out.write_wstring (ubi_estado);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return actualizarCiudad (ubi_id_ubicacion, ubi_nombre, ubi_estado        );
            } finally {
                _releaseReply ($in);
            }
  } // actualizarCiudad

  public boolean eliminarCiudad (int ubi_id_ubicacion)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("eliminarCiudad", true);
                $out.write_long (ubi_id_ubicacion);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return eliminarCiudad (ubi_id_ubicacion        );
            } finally {
                _releaseReply ($in);
            }
  } // eliminarCiudad

  public void shutdown ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("shutdown", false);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                shutdown (        );
            } finally {
                _releaseReply ($in);
            }
  } // shutdown

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CiudadApp/Ciudad:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _CiudadStub
