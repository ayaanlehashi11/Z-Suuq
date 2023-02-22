package com.ayaanle.h_suuq.interfaces;

public interface TransactionEncryptionListener {
    public boolean checkTransactionEncryptionHealth();
    public int checkEncryptionKeyLength();
    public void setEncryptionSignature();
    public int getEncryptionKeyLength();
}
