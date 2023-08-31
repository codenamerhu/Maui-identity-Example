using Com.Sybrin.Identity;
using Com.Sybrin.Identity.Countries.SouthAfrica.Passport;
using Com.Sybrin.Identity.Models;

namespace NewMauiTest2;

public partial class MainPage : ContentPage
{
    private static String SYBRIN_LICENSE = "rOiMrNdXa7lCfobiQYufh0/xUCQuiZdyJbVttqO6DVIXUjtHq13vHPJTEXvck1ecIBbMEBzzhzIG3wHgCxjEYfsH9N2K6EnVQgP637LZ0UFKw5qYftMPH9byai/NUc3p9FeCkepSX+aJYcueK4qqldZTy0doEwKik64xNhfKasyA5fLZFSbVbRrs4ghD5zp4L2AFBXL9XqVnB9ai+M7AF4x/1uJDIsJi6ts4M+tglqqIc9BFhCw8z/z8lnI0M/6L0SHsPa/ye14cD9x20Zd8N0zkAkQPt1zPRQ4H2WCYo1le6nfnLvVxyd/OMYA8ZPzt7UkjJ1KQGpWhnY6ZoOc8G2jDCY0RVBYc6XxJBHZD6vPm11Z+VYJXxwd7zymcrfSjxLtaDbDx402/1EhN1Vy2Zb1ZYSAJ/WhMOEcktmeai/M6sZiQ9/qABpFLI2xGDjUqnE59XwXkjMbL3FRlD46D3zIQW1vLEycwyUz3Jgo1o6fRgA7azMf54mG6Q3HXs1i/";

    public MainPage()
	{
		InitializeComponent();
	}

	public static void scan()
	{
        SybrinIdentityConfiguration sybrinIdentityConfiguration = new SybrinIdentityConfiguration.Builder(SYBRIN_LICENSE).Build();
        SybrinIdentity si = SybrinIdentity.GetInstance(Android.App.Application.Context, sybrinIdentityConfiguration);

        si.ScanDocument(Com.Sybrin.Identity.Enums.Document.SouthAfricaIDCard).AddOnSuccessListener(result);
        //    .AddOnSuccessListener(p0: k);
        //.AddOnFailureListener(e =>
        //{

        //})
        //.AddOnCancelListener(() =>
        //{

        //});


        var scanner = new IdentityScannerAdapter<DocumentModel>();

        // Add success, failure, and cancel listeners using lambda expressions
        scanner.AddOnSuccessListener(result => Console.WriteLine($"Success! Result: {result}"));
        scanner.AddOnFailureListener(exception => Console.WriteLine($"Failure! Exception: {exception.Message}"));
        scanner.AddOnCancelListener(() => Console.WriteLine("Cancelled!"));

    }
}



