package crc64fb2cd6f370dddac7;


public class IdentityScannerAdapter_1_LambdaOnCancelListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.sybrin.identity.IdentityScanner.OnCancelListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCancel:()V:GetOnCancelHandler:Com.Sybrin.Identity.IdentityScanner/IOnCancelListenerInvoker, IdentityBindingLibrary\n" +
			"";
		mono.android.Runtime.register ("IdentityScannerAdapter`1+LambdaOnCancelListener, NewMauiTest2", IdentityScannerAdapter_1_LambdaOnCancelListener.class, __md_methods);
	}


	public IdentityScannerAdapter_1_LambdaOnCancelListener ()
	{
		super ();
		if (getClass () == IdentityScannerAdapter_1_LambdaOnCancelListener.class) {
			mono.android.TypeManager.Activate ("IdentityScannerAdapter`1+LambdaOnCancelListener, NewMauiTest2", "", this, new java.lang.Object[] {  });
		}
	}


	public void onCancel ()
	{
		n_onCancel ();
	}

	private native void n_onCancel ();

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
