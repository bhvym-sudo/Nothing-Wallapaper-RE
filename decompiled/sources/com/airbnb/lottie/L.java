package com.airbnb.lottie;

import android.content.Context;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class L {
    public static boolean DBG = false;
    private static final int MAX_DEPTH = 20;
    public static final String TAG = "LOTTIE";
    private static LottieNetworkCacheProvider cacheProvider = null;
    private static int depthPastMaxDepth = 0;
    private static LottieNetworkFetcher fetcher = null;
    private static volatile NetworkCache networkCache = null;
    private static volatile NetworkFetcher networkFetcher = null;
    private static String[] sections = null;
    private static long[] startTimeNs = null;
    private static int traceDepth = 0;
    private static boolean traceEnabled = false;

    private L() {
    }

    public static void beginSection(String str) {
        if (traceEnabled) {
            int i10 = traceDepth;
            if (i10 == 20) {
                depthPastMaxDepth++;
                return;
            }
            sections[i10] = str;
            startTimeNs[i10] = System.nanoTime();
            p231x0.k.a(str);
            traceDepth++;
        }
    }

    public static float endSection(String str) {
        int i10 = depthPastMaxDepth;
        if (i10 > 0) {
            depthPastMaxDepth = i10 - 1;
            return 0.0f;
        }
        if (!traceEnabled) {
            return 0.0f;
        }
        int i11 = traceDepth - 1;
        traceDepth = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(sections[i11])) {
            p231x0.k.b();
            return (System.nanoTime() - startTimeNs[traceDepth]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + sections[traceDepth] + ".");
    }

    public static NetworkCache networkCache(Context context) {
        NetworkCache networkCache2;
        final Context applicationContext = context.getApplicationContext();
        NetworkCache networkCache3 = networkCache;
        if (networkCache3 != null) {
            return networkCache3;
        }
        synchronized (NetworkCache.class) {
            try {
                networkCache2 = networkCache;
                if (networkCache2 == null) {
                    LottieNetworkCacheProvider lottieNetworkCacheProvider = cacheProvider;
                    if (lottieNetworkCacheProvider == null) {
                        lottieNetworkCacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.L.1
                            @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                            public File getCacheDir() {
                                return new File(applicationContext.getCacheDir(), "lottie_network_cache");
                            }
                        };
                    }
                    networkCache2 = new NetworkCache(lottieNetworkCacheProvider);
                    networkCache = networkCache2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return networkCache2;
    }

    public static NetworkFetcher networkFetcher(Context context) {
        NetworkFetcher networkFetcher2;
        NetworkFetcher networkFetcher3 = networkFetcher;
        if (networkFetcher3 != null) {
            return networkFetcher3;
        }
        synchronized (NetworkFetcher.class) {
            try {
                networkFetcher2 = networkFetcher;
                if (networkFetcher2 == null) {
                    NetworkCache networkCache2 = networkCache(context);
                    LottieNetworkFetcher defaultLottieNetworkFetcher = fetcher;
                    if (defaultLottieNetworkFetcher == null) {
                        defaultLottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                    }
                    networkFetcher2 = new NetworkFetcher(networkCache2, defaultLottieNetworkFetcher);
                    networkFetcher = networkFetcher2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return networkFetcher2;
    }

    public static void setCacheProvider(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        cacheProvider = lottieNetworkCacheProvider;
    }

    public static void setFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
        fetcher = lottieNetworkFetcher;
    }

    public static void setTraceEnabled(boolean z9) {
        if (traceEnabled == z9) {
            return;
        }
        traceEnabled = z9;
        if (z9) {
            sections = new String[20];
            startTimeNs = new long[20];
        }
    }
}
