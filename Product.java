
import java.util.*;

class Product
{
	private int malaId;
	private String malaName;
	
	public Product()
	{
		malaId = 0;
		malaName = null;
	}

	public Product(int malaIdPara, String malaNamePara)
	{
		this.malaId = malaIdPara;
		this.malaName = malaNamePara;
	}

	public int getMalaId()
	{
		return malaId;
	}

	public String getMalaName()
	{
		return malaName;
	}
}
