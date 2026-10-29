package com.nothing.wallpaper.common;

import androidx.annotation.Keep;
import kotlin.jvm.internal.n;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class SecurityConfig {
    private final String darkTermsUrl;
    private final String debugUrl;
    private final String lightTermsUrl;
    private final String privacyUrl;
    private final String releaseUrl;

    public SecurityConfig(String releaseUrl, String debugUrl, String privacyUrl, String lightTermsUrl, String darkTermsUrl) {
        n.h(releaseUrl, "releaseUrl");
        n.h(debugUrl, "debugUrl");
        n.h(privacyUrl, "privacyUrl");
        n.h(lightTermsUrl, "lightTermsUrl");
        n.h(darkTermsUrl, "darkTermsUrl");
        this.releaseUrl = releaseUrl;
        this.debugUrl = debugUrl;
        this.privacyUrl = privacyUrl;
        this.lightTermsUrl = lightTermsUrl;
        this.darkTermsUrl = darkTermsUrl;
    }

    public static /* synthetic */ SecurityConfig copy$default(SecurityConfig securityConfig, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = securityConfig.releaseUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = securityConfig.debugUrl;
        }
        if ((i10 & 4) != 0) {
            str3 = securityConfig.privacyUrl;
        }
        if ((i10 & 8) != 0) {
            str4 = securityConfig.lightTermsUrl;
        }
        if ((i10 & 16) != 0) {
            str5 = securityConfig.darkTermsUrl;
        }
        String str6 = str5;
        String str7 = str3;
        return securityConfig.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.releaseUrl;
    }

    public final String component2() {
        return this.debugUrl;
    }

    public final String component3() {
        return this.privacyUrl;
    }

    public final String component4() {
        return this.lightTermsUrl;
    }

    public final String component5() {
        return this.darkTermsUrl;
    }

    public final SecurityConfig copy(String releaseUrl, String debugUrl, String privacyUrl, String lightTermsUrl, String darkTermsUrl) {
        n.h(releaseUrl, "releaseUrl");
        n.h(debugUrl, "debugUrl");
        n.h(privacyUrl, "privacyUrl");
        n.h(lightTermsUrl, "lightTermsUrl");
        n.h(darkTermsUrl, "darkTermsUrl");
        return new SecurityConfig(releaseUrl, debugUrl, privacyUrl, lightTermsUrl, darkTermsUrl);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SecurityConfig)) {
            return false;
        }
        SecurityConfig securityConfig = (SecurityConfig) obj;
        return n.d(this.releaseUrl, securityConfig.releaseUrl) && n.d(this.debugUrl, securityConfig.debugUrl) && n.d(this.privacyUrl, securityConfig.privacyUrl) && n.d(this.lightTermsUrl, securityConfig.lightTermsUrl) && n.d(this.darkTermsUrl, securityConfig.darkTermsUrl);
    }

    public final String getDarkTermsUrl() {
        return this.darkTermsUrl;
    }

    public final String getDebugUrl() {
        return this.debugUrl;
    }

    public final String getLightTermsUrl() {
        return this.lightTermsUrl;
    }

    public final String getPrivacyUrl() {
        return this.privacyUrl;
    }

    public final String getReleaseUrl() {
        return this.releaseUrl;
    }

    public int hashCode() {
        return (((((((this.releaseUrl.hashCode() * 31) + this.debugUrl.hashCode()) * 31) + this.privacyUrl.hashCode()) * 31) + this.lightTermsUrl.hashCode()) * 31) + this.darkTermsUrl.hashCode();
    }

    public String toString() {
        return "SecurityConfig(releaseUrl=" + this.releaseUrl + ", debugUrl=" + this.debugUrl + ", privacyUrl=" + this.privacyUrl + ", lightTermsUrl=" + this.lightTermsUrl + ", darkTermsUrl=" + this.darkTermsUrl + ")";
    }
}
