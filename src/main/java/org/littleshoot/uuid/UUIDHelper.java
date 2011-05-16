package org.littleshoot.uuid;


/**
* org.littleshoot/uuid/UUIDHelper.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from uuid.idl
* Sonntag, 7. März 2004 21.35 Uhr CET
*/


/**
 * The UUID struct.
 */
abstract public class UUIDHelper
{
  private static String  _id = "IDL:org.littleshoot/uuid/UUID:1.0";

  public static void insert (org.omg.CORBA.Any a, org.littleshoot.uuid.UUID that)
  {
    org.omg.CORBA.portable.OutputStream out = a.create_output_stream ();
    a.type (type ());
    write (out, that);
    a.read_value (out.create_input_stream (), type ());
  }

  public static org.littleshoot.uuid.UUID extract (org.omg.CORBA.Any a)
  {
    return read (a.create_input_stream ());
  }

  private static org.omg.CORBA.TypeCode __typeCode = null;
  private static boolean __active = false;
  synchronized public static org.omg.CORBA.TypeCode type ()
  {
    if (__typeCode == null)
    {
      synchronized (org.omg.CORBA.TypeCode.class)
      {
        if (__typeCode == null)
        {
          if (__active)
          {
            return org.omg.CORBA.ORB.init().create_recursive_tc ( _id );
          }
          __active = true;
          org.omg.CORBA.StructMember[] _members0 = new org.omg.CORBA.StructMember [2];
          org.omg.CORBA.TypeCode _tcOf_members0 = null;
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_longlong);
          _members0[0] = new org.omg.CORBA.StructMember (
            "time",
            _tcOf_members0,
            null);
          _tcOf_members0 = org.omg.CORBA.ORB.init ().get_primitive_tc (org.omg.CORBA.TCKind.tk_longlong);
          _members0[1] = new org.omg.CORBA.StructMember (
            "clockSeqAndNode",
            _tcOf_members0,
            null);
          __typeCode = org.omg.CORBA.ORB.init ().create_struct_tc (org.littleshoot.uuid.UUIDHelper.id (), "UUID", _members0);
          __active = false;
        }
      }
    }
    return __typeCode;
  }

  public static String id ()
  {
    return _id;
  }

  public static org.littleshoot.uuid.UUID read (org.omg.CORBA.portable.InputStream istream)
  {
    org.littleshoot.uuid.UUID value = new org.littleshoot.uuid.UUID ();
    value.time = istream.read_longlong ();
    value.clockSeqAndNode = istream.read_longlong ();
    return value;
  }

  public static void write (org.omg.CORBA.portable.OutputStream ostream, org.littleshoot.uuid.UUID value)
  {
    ostream.write_longlong (value.time);
    ostream.write_longlong (value.clockSeqAndNode);
  }

}
