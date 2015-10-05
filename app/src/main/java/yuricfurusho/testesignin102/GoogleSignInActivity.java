package yuricfurusho.testesignin102;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class GoogleSignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_party_sign_in);

        if (savedInstanceState == null) {
            GoogleSignInFragment googleSignInFragment = new GoogleSignInFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragContainer, googleSignInFragment, GoogleSignInFragment.class.getSimpleName())
                    .commit();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getSupportFragmentManager().findFragmentByTag(GoogleSignInFragment.class.getSimpleName()).onActivityResult(requestCode, resultCode, data);
    }

}
