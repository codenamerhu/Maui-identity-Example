package crc64fb2cd6f370dddac7;


public class IdentityScannerAdapter_1
	extends com.sybrin.identity.IdentityScanner
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("IdentityScannerAdapter`1, NewMauiTest2", IdentityScannerAdapter_1.class, __md_methods);
	}


	public IdentityScannerAdapter_1 ()
	{
		super ();
		if (getClass () == IdentityScannerAdapter_1.class) {
			mono.android.TypeManager.Activate ("IdentityScannerAdapter`1, NewMauiTest2", "", this, new java.lang.Object[] {  });
		}
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
