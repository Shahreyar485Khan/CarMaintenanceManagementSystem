/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokenmgt;

/**
 *
 * @author Shahryar
 */
public class TokenMgt {

    private String id;
    private String name;
    private String oil;
    private String tun;
    private String rep;
    
  public TokenMgt(String cid, String cname, String coil, String ctun, String crep)
    {
        this.id = cid;
        this.name = cname;
        this.oil = coil;
        this.tun = ctun;
        this.rep = crep;
    }
    
    public String getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getoil()
    {
        if(oil.equals("TRUE"))
        {
            oil = "Consumed";
        }else if(oil.equals("FALSE"))
        {
            oil = "FREE";
        }
        return oil;
    }
    
    public String gettun()
    {
         if(tun.equals("TRUE"))
        {
            tun = "Consumed";
        }else if(tun.equals("FALSE"))
        {
            tun = "FREE";
        }
        return  tun;
    }
    
    public String getrep()
    {
         if(rep.equals("TRUE"))
        {
            rep = "Consumed";
        }else if(rep.equals("FALSE"))
        {
            rep = "FREE";
        }
        return rep;
    }
        
    
    
}
