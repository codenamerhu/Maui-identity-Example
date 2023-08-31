package crc64fb2cd6f370dddac7;


public class IdentityScannerAdapter_1_LambdaOnFailureListener
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.sybrin.identity.IdentityScanner.OnFailureListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onFailure:(Lcom/sybrin/identity/exceptions/IdentityException;)V:GetOnFailure_Lcom_sybrin_identity_exceptions_IdentityException_Handler:Com.Sybrin.Identity.IdentityScanner/IOnFailureListenerInvoker, IdentityBindingLibrary\n" +
			"";
		mono.android.Runtime.register ("IdentityScannerAdapter`1+LambdaOnFailureListener, NewMauiTest2", IdentityScannerAdapter_1_LambdaOnFailureListener.class, __md_methods);
	}


	public IdentityScannerAdapter_1_LambdaOnFailureListener ()
	{
		super ();
		if (getClass () == IdentityScannerAdapter_1_LambdaOnFailureListener.class) {
			mono.android.TypeManager.Activate ("IdentityScannerAdapter`1+LambdaOnFailureListener, NewMauiTest2", "", this, new java.lang.Object[] {  });
		}
	}


	public void onFailure (com.sybrin.identity.exceptions.IdentityException p0)
	{
		n_onFailure (p0);
	}

	private native void n_onFailure (com.sybrin.identity.exceptions.IdentityException p0);

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
