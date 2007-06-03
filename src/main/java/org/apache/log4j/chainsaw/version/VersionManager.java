package org.apache.log4j.chainsaw.version;


/**
 * @author psmith
 *
 */
public class VersionManager
{

    private static final VersionManager instance = new VersionManager();
    
    private static final String VERSION_INFO = "1.99.99 (02 March 2006)";
    
    public static final VersionManager getInstance() {
        return instance;
    }
    
    public String getVersionNumber() {
        return VERSION_INFO;
    }
    
    /**
     * 
     */
    private VersionManager()
    {
    }

}