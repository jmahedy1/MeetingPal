import static com.teamdev.jxbrowser.engine.RenderingMode.HARDWARE_ACCELERATED;

import com.teamdev.jxbrowser.browser.*;
import com.teamdev.jxbrowser.engine.*;
import com.teamdev.jxbrowser.view.swing.BrowserView;

public class API {
    public BrowserView startApi(String x) {
        EngineOptions options = EngineOptions.newBuilder(HARDWARE_ACCELERATED)
                                             .licenseKey("1BNDHFSC1G6CU9KKP7LJPVHOH2VI0A0FR2HHAHQS5HFMGFXSP4BLSRXKLAST7QSOKATWA0")
                                             .build();
        Engine engine = Engine.newInstance(options);
        Browser browser = engine.newBrowser();
        BrowserView view = BrowserView.newInstance(browser);
        browser.navigation().loadUrl(x);
        return view;
    }
}