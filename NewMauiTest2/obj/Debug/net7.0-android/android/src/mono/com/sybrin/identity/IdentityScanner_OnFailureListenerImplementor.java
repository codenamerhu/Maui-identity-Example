package mono.com.sybrin.identity;


public class IdentityScanner_OnFailureListenerImplementor
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
		mono.android.Runtime.register ("Com.Sybrin.Identity.IdentityScanner+IOnFailureListenerImplementor, IdentityBindingLibrary", IdentityScanner_OnFailureListenerImplementor.class, __md_methods);
	}


	public IdentityScanner_OnFailureListenerImplementor ()
	{
		super ();
		if (getClass () == IdentityScanner_OnFailureListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Sybrin.Identity.IdentityScanner+IOnFailureListenerImplementor, IdentityBindingLibrary", "", this, new java.lang.Object[] {  });
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
