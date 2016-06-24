package poe.reborn.com.things;

import java.util.List;
import java.util.Map;

/**
 * Exslims
 * 24.06.2016
 */
public interface ThingsDAO {
    /**
     * Get all things by passed arguments.
     * Thing JSON Pojo should have additional 2 params: account name and tab where it is.
     * @param arguments thing properties(lvl, itlvl, account name, tab, properties e.t.c), example: {"accountName" : "Exslims"}
     *                  select will "........ where key1 = value1 and key2 = value2";
     * @return List of found things
     */
    List<String> getThings(Map<String,String> arguments);

    /**
     * Update account, account have tabs, tabs have list of things, todo обсудить архитуктуру
     * In DataBase stored things, things have tabs where it is and account name who owns it.
     * @param accountName account name(like arg to simplify the search,
     *                    you don't need parse JSON to obtain the name of the account)
     * @param tabName tab name where all things of this tab was stored.
     * @param jsonThings list of things of this account.
     *               Things are stateful, so they can not be modified, they can only were deleted or create.
     *               If the thing was in this tab, and in the next update of this thing out of this tab, so it should be removed from this tab.
     */
    void updateAccount(String accountName, String tabName, List<String> jsonThings);
}
