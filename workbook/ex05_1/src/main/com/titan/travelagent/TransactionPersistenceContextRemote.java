package com.titan.travelagent;

import javax.ejb.Remote;

import com.titan.domain.Cabin;

@Remote
public interface TransactionPersistenceContextRemote
{
    public void setCabin(int pk);
    public void updateBedCount(int newBedCount);
    public void remove();
}
