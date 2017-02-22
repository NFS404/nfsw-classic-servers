package me.leorblx.classicnfsw.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryItemTransType", propOrder = {"entitlementTag", "expirationDate", "hash", "inventoryId",
        "productId", "remainingUseCount", "resellPrice", "status", "stringHash", "virtualItemType"})
public class InventoryItemTransType
{
    @XmlElement(name = "EntitlementTag", required = true)
    private String entitlementTag;
    @XmlElement(name = "ExpirationDate", required = true)
    private String expirationDate;
    @XmlElement(name = "Hash")
    protected long hash;
    @XmlElement(name = "InventoryId")
    private long inventoryId;
    @XmlElement(name = "ProductId", required = true)
    private String productId;
    @XmlElement(name = "RemainingUseCount")
    private int remainingUseCount;
    @XmlElement(name = "ResellPrice")
    private float resellPrice;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "StringHash", required = true)
    private String stringHash;
    @XmlElement(name = "VirtualItemType", required = true)
    private String virtualItemType;

    public String getEntitlementTag()
    {
        return entitlementTag;
    }

    public void setEntitlementTag(String entitlementTag)
    {
        this.entitlementTag = entitlementTag;
    }

    public String getExpirationDate()
    {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate)
    {
        this.expirationDate = expirationDate;
    }

    public long getHash()
    {
        return hash;
    }

    public void setHash(long hash)
    {
        this.hash = hash;
    }

    public long getInventoryId()
    {
        return inventoryId;
    }

    public void setInventoryId(long inventoryId)
    {
        this.inventoryId = inventoryId;
    }

    public String getProductId()
    {
        return productId;
    }

    public void setProductId(String productId)
    {
        this.productId = productId;
    }

    public int getRemainingUseCount()
    {
        return remainingUseCount;
    }

    public void setRemainingUseCount(int remainingUseCount)
    {
        this.remainingUseCount = remainingUseCount;
    }

    public float getResellPrice()
    {
        return resellPrice;
    }

    public void setResellPrice(float resellPrice)
    {
        this.resellPrice = resellPrice;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStringHash()
    {
        return stringHash;
    }

    public void setStringHash(String stringHash)
    {
        this.stringHash = stringHash;
    }

    public String getVirtualItemType()
    {
        return virtualItemType;
    }

    public void setVirtualItemType(String virtualItemType)
    {
        this.virtualItemType = virtualItemType;
    }
}