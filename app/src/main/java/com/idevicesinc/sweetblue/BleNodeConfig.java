package com.idevicesinc.sweetblue;


public class BleNodeConfig
{

    /**
     * Constant for an invalid or unknown transmission power.
     *
     * @see BleDevice#getTxPower()
     * @see BleDeviceConfig#defaultTxPower
     */
    public static final int INVALID_TX_POWER							= Integer.MIN_VALUE;

    @Override protected BleNodeConfig clone()
    {
        try
        {
            return (BleNodeConfig) super.clone();
        }
        catch (CloneNotSupportedException e)
        {
        }

        return null;
    }

}