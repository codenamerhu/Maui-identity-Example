package mono.com.sybrin.identity;


public class IdentityScanner_OnCancelListenerImplementor
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
		mono.android.Runtime.register ("Com.Sybrin.Identity.IdentityScanner+IOnCancelListenerImplementor, IdentityBindingLibrary", IdentityScanner_OnCancelListenerImplementor.class, __md_methods);
	}


	public IdentityScanner_OnCancelListenerImplementor ()
	{
		super ();
		if (getClass () == IdentityScanner_OnCancelListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Sybrin.Identity.IdentityScanner+IOnCancelListenerImplementor, IdentityBindingLibrary", "", this, new java.lang.Object[] {  });
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
