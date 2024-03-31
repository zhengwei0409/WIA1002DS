
package Tuto;

/**
 *
 * Represents a collection of bids for installing air conditioning units.
 * 
 * @author zhengwei
 */
public interface BidCollectionInterface {
    
     /**
     * Adds a bid to this collection.
     * 
     * @param bid The bid to be added.
     * @precondition The bid is not null.
     * @postcondition The bid is added to the collection.
     */
    void addBid(BidInterface bid);
    
     /**
     * Returns the bid in this collection with the best yearly cost.
     * 
     * @return The bid with the best yearly cost.
     * @precondition The collection is not empty.
     * @postcondition The best bid is returned.
     */
    BidInterface getBestYearlyCostBid();
    
    
     /**
     * Returns the bid in this collection with the best initial cost.
     * initial cost = unit cost + installation cost.
     * 
     * 
     * @return The bid with the best initial cost.
     * @precondition The collection is not empty.
     * @postcondition The best bid is returned.
     */
    BidInterface getBestInitialCostBid();
    
     /**
     * Clears all of the bids from this collection.
     * 
     * @precondition None.
     * @postcondition The collection is empty.
     */
    void clear();
    
     /**
     * Gets the number of bids in this collection.
     * 
     * @return The number of bids.
     * @precondition None.
     * @postcondition The number of bids is returned.
     */
    int getSize();
    
     /**
     * Checks whether this collection is empty.
     * 
     * @return True if the collection is empty, false otherwise.
     * @precondition None.
     * @postcondition The boolean value is returned.
     */
    boolean isEmpty();
}
