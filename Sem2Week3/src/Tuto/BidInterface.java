
package Tuto;

/*

Javadoc style comments are a way of documenting your Java code in a format that 
can be automatically processed to generate documentation in HTML format. 
These comments are specifically formatted to provide information about 
classes, methods, fields, and other elements of your code.

*/

/**
 *
 * This interface is about bid for installing an air conditioner
 * 
 * @author zhengwei
 */
public interface BidInterface {
    
    /**
     * 
     * Return the name of the company making this bid
     * 
     * @return The name of the company
     */
    public String getCompanyName();
    
    /**
     * Returns the description of the air conditioner that this bid is for.
     * 
     * @return The description of the air conditioner.
     */
    public String getACDescription();
    
    
    /**
     * Returns the capacity of this bid's AC in tons (1 ton = 12,000 BTU).
     * 
     * @return The capacity of the AC in tons.
     */
   public double getCapacityInTons();
   
   
   /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     * 
     * @return The seasonal efficiency of the AC.
     */
    public double getSeasonalEfficiency();
    
    /**
     * Returns the cost of this bid's AC.
     * 
     * @return The cost of the AC.
     */
    public double getUnitCost();
    
    /**
     * Returns the cost of installing this bid's AC.
     * 
     * @return The cost of installing the AC.
     */
    public double getInstallationCost();
    
    /**
     * Returns the yearly cost of operating this bid's AC.
     * 
     * @return The yearly cost of operating the AC.
     */
    public double getYearlyOperatingCost();
   
}
