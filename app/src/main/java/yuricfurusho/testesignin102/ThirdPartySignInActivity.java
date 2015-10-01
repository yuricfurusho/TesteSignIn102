package yuricfurusho.testesignin102;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class ThirdPartySignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_party_sign_in);

        ThirdPartySignInFragment thirdPartySignInFragment = new ThirdPartySignInFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragContainer, thirdPartySignInFragment, ThirdPartySignInFragment.class.getSimpleName())
                .commit();
    }

}
