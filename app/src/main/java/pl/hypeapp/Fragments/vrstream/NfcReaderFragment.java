package pl.hypeapp.Fragments.vrstream;

import android.content.Context;
import android.content.Intent;
import android.net.wifi.WifiManager;
import android.nfc.NdefMessage;
import android.nfc.NdefRecord;
import android.nfc.NfcAdapter;
import android.nfc.NfcEvent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.nio.charset.Charset;
import java.util.ArrayList;

import pl.hypeapp.vrstream.NfcReaderActivity;
import pl.hypeapp.vrstream.R;
import pl.hypeapp.vrstream.ViewStreamActivity;


public class NfcReaderFragment extends Fragment implements View.OnClickListener{


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.nfc_reader_fragment, container, false);

        Button nfcReaderIntent = (Button) v.findViewById(R.id.intent_nfc_reader_activity);
        nfcReaderIntent.setOnClickListener(this);

        return v;

    }



    @Override
    public void onClick(View view) {
        Intent i = new Intent(getActivity(), NfcReaderActivity.class);
        startActivity(i);
    }
}
