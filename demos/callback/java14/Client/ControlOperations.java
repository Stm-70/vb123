package Client;


/**
* Client/ControlOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.1"
* from ../client.idl
* Donnerstag, 13. Juni 2002 14.16 Uhr CEST
*/

public interface ControlOperations 
{
  void setId (int id);
  int getId ();
  void start ();
  String stop ();
  void sendBigArrayToClient (byte[] buffer);
  void sendWStringToClient (String wstr);
} // interface ControlOperations
