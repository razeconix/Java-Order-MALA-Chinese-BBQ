
import java.util.*;

class Sauce
{
	private int sauceId;
	private String sauceName;

	public Sauce()
	{
		sauceId = 0;
		sauceName = null;
	}

	public Sauce(int sauceIdPara, String sauceNamePara)
	{
		this.sauceId = sauceIdPara;
		this.sauceName = sauceNamePara;
	}

	public int getSauceId()
	{
		return sauceId;
	}

	public String getSauceName()
	{
		return sauceName;
	}
}
