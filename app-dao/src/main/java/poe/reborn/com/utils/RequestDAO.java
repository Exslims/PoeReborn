package poe.reborn.com.utils;

import java.util.List;

/**
 * Exslims
 * 24.06.2016
 */
public interface RequestDAO {
    /**
     * Add new nextChangeId from last request
     * @param id nextChangeID
     */
    void addNextChangeID(String id);

    /**
     * Get's last nextChangeIDs. Uses for backup or some issues.
     * @return last nextChangeID
     */
    String getLastNextChangeID();

    /**
     * Get's last nextChangeIDs(chunk)
     * @param idCount number of last id's
     * @return list of last nextChangeIds
     */
    List<String> getLastNextChadeIDs(int idCount);
}
