package mono.com.sybrin.identity;


public class IdentityScanner_OnSuccessListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.sybrin.identity.IdentityScanner.OnSuccessListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSuccess:(Ljava/lang/Object;)V:GetOnSuccess_Ljava_lang_Object_Handler:Com.Sybrin.Identity.IdentityScanner/IOnSuccessListenerInvoker, IdentityBindingLibrary\n" +
			"";
		mono.android.Runtime.register ("Com.Sybrin.Identity.IdentityScanner+IOnSuccessListenerImplementor, IdentityBindingLibrary", IdentityScanner_OnSuccessListenerImplementor.class, __md_methods);
	}


	public IdentityScanner_OnSuccessListenerImplementor ()
	{
		super ();
		if (getClass () == IdentityScanner_OnSuccessListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Com.Sybrin.Identity.IdentityScanner+IOnSuccessListenerImplementor, IdentityBindingLibrary", "", this, new java.lang.Object[] {  });
		}
	}


	public void onSuccess (java.lang.Object p0)
	{
		n_onSuccess (p0);
	}

	private native void n_onSuccess (java.lang.Object p0);

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
