package com.csair.b2c.cloud.test.pattern.proxy.rmiservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import com.csair.b2c.cloud.test.pattern.state.good.State;

public interface GumballMachineRemote extends Remote {
	int getCount() throws RemoteException;

	String getLocation() throws RemoteException;

	State getCurrentState() throws RemoteException;
}
