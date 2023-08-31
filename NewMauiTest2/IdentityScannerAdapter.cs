using Com.Sybrin.Identity.Exceptions;
using static Com.Sybrin.Identity.IdentityScanner;
using  Com.Sybrin.Identity;

public interface IOnSuccessListener<T>
{
    void OnSuccess(T result);
}

public interface IOnFailureListener
{
    void OnFailure(IdentityException ie);
}

public interface IOnCancelListener
{
    void OnCancel();
}

public class IdentityException : Exception
{
    // Add necessary members for IdentityException if needed
}

public class IdentityScannerAdapter<T> : IdentityScanner
{
    public IdentityScannerAdapter<T> AddOnSuccessListener(Action<T> onSuccessAction)
    {
        AddOnSuccessListener(new LambdaOnSuccessListener(onSuccessAction));
        return this;
    }

    private void AddOnSuccessListener(LambdaOnSuccessListener lambdaOnSuccessListener)
    {
        throw new NotImplementedException();
    }

    public IdentityScannerAdapter<T> AddOnFailureListener(Action<IdentityException> onFailureAction)
    {
        AddOnFailureListener(new LambdaOnFailureListener(onFailureAction));
        return this;
    }

    private void AddOnFailureListener(LambdaOnFailureListener lambdaOnFailureListener)
    {
        throw new NotImplementedException();
    }

    public IdentityScannerAdapter<T> AddOnCancelListener(Action onCancelAction)
    {
        AddOnCancelListener(new LambdaOnCancelListener(onCancelAction));
        return this;
    }

    private void AddOnCancelListener(LambdaOnCancelListener lambdaOnCancelListener)
    {
        throw new NotImplementedException();
    }

    private class LambdaOnSuccessListener : Java.Lang.Object, IOnSuccessListener<T>
    {
        private readonly Action<T> _action;

        public LambdaOnSuccessListener(Action<T> action)
        {
            _action = action;
        }

        public void OnSuccess(T result)
        {
            _action?.Invoke(result);
        }
    }

    private class LambdaOnFailureListener : Java.Lang.Object, IOnFailureListener
    {
        private readonly Action<IdentityException> _action;

        public LambdaOnFailureListener(Action<IdentityException> action)
        {
            _action = action;
        }

        public void OnFailure(IdentityException ie)
        {
            _action?.Invoke(ie);
        }

        public void OnFailure(Com.Sybrin.Identity.Exceptions.IdentityException p0)
        {
            throw new NotImplementedException();
        }
    }

    private class LambdaOnCancelListener : Java.Lang.Object, IOnCancelListener
    {
        private readonly Action _action;

        public LambdaOnCancelListener(Action action)
        {
            _action = action;
        }

        public void OnCancel()
        {
            _action?.Invoke();
        }
    }
}