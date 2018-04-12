/**
 * BanqueService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mypackage;

public interface BanqueService extends java.rmi.Remote {
    public mypackage.Compte getCompte(java.lang.Long code) throws java.rmi.RemoteException;
    public mypackage.Compte[] getComptes() throws java.rmi.RemoteException;
    public void addComptes(java.lang.String soldes) throws java.rmi.RemoteException;

    public double conversionEuroToDollar(double montant) throws java.rmi.RemoteException;
    public void addCompte(float solde) throws java.rmi.RemoteException;
    public void addCompte2(mypackage.Compte compte) throws java.rmi.RemoteException;
}
