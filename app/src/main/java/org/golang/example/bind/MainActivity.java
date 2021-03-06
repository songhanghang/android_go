/*
 * Copyright 2015 The Go Authors. All rights reserved.
 * Use of this source code is governed by a BSD-style
 * license that can be found in the LICENSE file.
 */

package org.golang.example.bind;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import hello.Hello;

public class MainActivity extends Activity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.mytextview);

        // Call Go function.
        String greetings = Hello.greetings("http://int.dpool.sina.com.cn/iplookup/iplookup.php?format=json&ip=218.4.255.255");
        mTextView.setText(greetings);
    }
}
