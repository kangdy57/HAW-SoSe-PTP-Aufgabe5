// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
// "Home"-VCS:  git@git.HAW-Hamburg.de:shf/Px/LabExercise/ZZZ_SupportStuff[.git]
package cards;


import java.io.Serializable;


/**
 * This class is only for INTERNAL purposes.<br />
 * <br />
 * 
 * The single purpose of this class is to hold the &quot;project version&quot;.
 * Since the code/project is an exercise, it's named {@link GivenCodeVersion}.
 * It's not expected or wanted that there are different release branches.
 * There has to be only one single release branch (for the "given code")!!!
 * Hence, there is a single/central project version
 * that is stored in this class.<br />
 * <br />
 * <code>
 * Coding/format of (Given) Code Version<br />
 * &nbsp;&nbsp;c: coding format<br />
 * &nbsp;&nbsp;m: main version<br />
 * &nbsp;&nbsp;s: sub version<br />
 * &nbsp;&nbsp;Y: year<br />
 * &nbsp;&nbsp;M: month<br />
 * &nbsp;&nbsp;D: day<br />
 * &nbsp;&nbsp;d: version of day<br />
 * <br />
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; c___mmmm_sss___YYYY_MM_DD__ddd<br />
 * &nbsp;&nbsp;e.g.&nbsp;&nbsp;                     1___0001_014___2021_11_20__001<br />
 * <br />
 * &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; c___mmmmm_sss___YYYY_MM_DD__dd<br />
 * &nbsp;&nbsp;e.g.&nbsp;&nbsp;                     2___00001_014___2021_11_20__01
 * <code />
 * 
 * @author  Michael Schaefers  ([UTF-8]:"Michael Schäfers");
 *          P1@Hamburg-UAS.eu 
 * @version {@value #encodedVersion} 
 */
class GivenCodeVersion implements Serializable {
    //
    //--VERSION:-------------------------------#---vvvvvvvvv---vvvv-vv-vv--vv
    //  ========                               #___~version~___YYYY_MM_DD__dd_
    final static private long encodedVersion = 2___00001_001___2022_05_13__01L;
    //-----------------------------------------#---^^^^^-^^^---^^^^-^^-^^--^^
    final static private Version version = new Version( encodedVersion );
    private static final long serialVersionUID = version.getVersionNumber();
    
    
    
    
    
    /**
     * The method {@link #getVersionNumber()} delivers the project version.
     * 
     * @return version
     */
    static public long getVersionNumber(){
        return version.getVersionNumber();
    }//method()
    
    /**
     * The method {@link #getDecodedVersion()} delivers the given project version as reground/readable String.
     * 
     * @return version as decoded/readable String.
     */
    static public String getDecodedVersion(){
        return version.getDecodedVersion();
    }//method()
    
}//class
