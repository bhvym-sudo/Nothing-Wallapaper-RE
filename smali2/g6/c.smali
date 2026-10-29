.class public final Lg6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/c$a;
    }
.end annotation


# static fields
.field public static final f:Lg6/c$a;

.field private static final g:Ljava/lang/String;

.field private static volatile h:Lg6/c;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lh8/h;

.field private c:LZ7/b;

.field private d:Z

.field private final e:Landroid/os/Vibrator;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lg6/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lg6/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lg6/c;->f:Lg6/c$a;

    const-string v0, "NtUIVibrateUtils"

    sput-object v0, Lg6/c;->g:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg6/c;->a:Landroid/content/Context;

    new-instance v0, Lg6/b;

    invoke-direct {v0}, Lg6/b;-><init>()V

    invoke-static {v0}, Lh8/i;->b(Lv8/a;)Lh8/h;

    move-result-object v0

    iput-object v0, p0, Lg6/c;->b:Lh8/h;

    const-string v0, "vibrator_manager"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.os.VibratorManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->f(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/os/VibratorManager;

    invoke-virtual {p1}, Landroid/os/VibratorManager;->getDefaultVibrator()Landroid/os/Vibrator;

    move-result-object p1

    const-string v0, "getDefaultVibrator(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lg6/c;->e:Landroid/os/Vibrator;

    return-void
.end method

.method public static synthetic a()LF8/L;
    .registers 1

    invoke-static {}, Lg6/c;->j()LF8/L;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic b()Lg6/c;
    .registers 1

    sget-object v0, Lg6/c;->h:Lg6/c;

    return-object v0
.end method

.method public static final synthetic c(Lg6/c;)V
    .registers 1

    sput-object p0, Lg6/c;->h:Lg6/c;

    return-void
.end method

.method private final d()LF8/L;
    .registers 1

    iget-object p0, p0, Lg6/c;->b:Lh8/h;

    invoke-interface {p0}, Lh8/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, LF8/L;

    return-object p0
.end method

.method private final e(Ljava/lang/String;)Ljava/lang/String;
    .registers 6

    iget-object p0, p0, Lg6/c;->a:Landroid/content/Context;

    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p0

    const-string v0, "haptic_feedback_intensity"

    const/4 v1, 0x2

    invoke-static {p0, v0, v1}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result p0

    sget-object v0, Lg6/c;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "vibrateIntensity:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v0, 0x1

    if-eq p0, v0, :cond_5f

    const-string v0, "/vendor/etc/richtapresources/"

    if-eq p0, v1, :cond_4f

    const/4 v1, 0x3

    if-eq p0, v1, :cond_3d

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_3d
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "/vendor/etc/richtapresources/strong/"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4f
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_5f
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "/vendor/etc/richtapresources/weak/"

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final j()LF8/L;
    .registers 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {v0, v1, v0}, LF8/A0;->b(LF8/x0;ILjava/lang/Object;)LF8/y;

    move-result-object v0

    invoke-static {}, LF8/b0;->c()LF8/H0;

    move-result-object v1

    invoke-interface {v0, v1}, Lm8/i;->z(Lm8/i;)Lm8/i;

    move-result-object v0

    invoke-static {v0}, LF8/M;->a(Lm8/i;)LF8/L;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final f()Landroid/os/Vibrator;
    .registers 1

    iget-object p0, p0, Lg6/c;->e:Landroid/os/Vibrator;

    return-object p0
.end method

.method public final g()V
    .registers 7

    invoke-direct {p0}, Lg6/c;->d()LF8/L;

    move-result-object v0

    new-instance v3, Lg6/c$b;

    const/4 v1, 0x0

    invoke-direct {v3, p0, v1}, Lg6/c$b;-><init>(Lg6/c;Lm8/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, LF8/g;->d(LF8/L;Lm8/i;LF8/N;Lv8/p;ILjava/lang/Object;)LF8/x0;

    return-void
.end method

.method public final h()Z
    .registers 6

    iget-object v0, p0, Lg6/c;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    const-string v1, "haptic_feedback_enabled"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/provider/Settings$System;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_18

    sget-object p0, Lg6/c;->g:Ljava/lang/String;

    const-string v0, "playSwitchVibrate: touch vibrate settings is off !"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_18
    :try_start_18
    invoke-static {}, LZ7/b;->e()LZ7/b;

    move-result-object v0

    iget-object v3, p0, Lg6/c;->a:Landroid/content/Context;

    invoke-virtual {v0, v3}, LZ7/b;->g(Landroid/content/Context;)LZ7/b;
    :try_end_21
    .catch Ljava/lang/NoSuchMethodError; {:try_start_18 .. :try_end_21} :catch_22

    goto :goto_2b

    :catch_22
    move-exception v0

    sget-object v3, Lg6/c;->g:Ljava/lang/String;

    const-string v4, "Cannot find AACHapticUtils"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 v0, 0x0

    :goto_2b
    if-nez v0, :cond_2e

    return v2

    :cond_2e
    iput-object v0, p0, Lg6/c;->c:LZ7/b;

    invoke-virtual {v0}, LZ7/b;->h()Z

    move-result v2

    iput-boolean v2, p0, Lg6/c;->d:Z

    if-nez v2, :cond_40

    sget-object p0, Lg6/c;->g:Ljava/lang/String;

    const-string v0, "playSwitchVibrate: not support rich tap !"

    invoke-static {p0, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_40
    new-instance v2, Ljava/io/File;

    const-string v3, "NT_OnOff_button.he"

    invoke-direct {p0, v3}, Lg6/c;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_5f

    sget-object v2, Lg6/c;->g:Ljava/lang/String;

    const-string v3, "Could not get vibrate file in vendor folder. Get from system folder again."

    invoke-static {v2, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v2, Ljava/io/File;

    const-string v3, "/system/etc/richtapresources/NT_OnOff_button.he"

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    :cond_5f
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_92

    sget-object v3, Lg6/c;->g:Ljava/lang/String;

    const-string v4, "playSwitchVibrate: AACHapticUtils init!"

    invoke-static {v3, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :try_start_6c
    iget-object p0, p0, Lg6/c;->a:Landroid/content/Context;

    invoke-virtual {v0, p0}, LZ7/b;->g(Landroid/content/Context;)LZ7/b;

    invoke-virtual {v0, v2, v1}, LZ7/b;->m(Ljava/io/File;I)V

    const-string p0, "playSwitchVibrate: playPattern"

    invoke-static {v3, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_79
    .catch Ljava/lang/Exception; {:try_start_6c .. :try_end_79} :catch_7a

    goto :goto_99

    :catch_7a
    move-exception p0

    sget-object v0, Lg6/c;->g:Ljava/lang/String;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "playSwitchVibrate failed:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v0, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_99

    :cond_92
    sget-object p0, Lg6/c;->g:Ljava/lang/String;

    const-string v0, "Could not find vibrate file"

    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :goto_99
    return v1
.end method

.method public final i(Lm8/e;)Ljava/lang/Object;
    .registers 5

    invoke-static {}, LF8/b0;->b()LF8/I;

    move-result-object v0

    new-instance v1, Lg6/c$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lg6/c$c;-><init>(Lg6/c;Lm8/e;)V

    invoke-static {v0, v1, p1}, LF8/g;->g(Lm8/i;Lv8/p;Lm8/e;)Ljava/lang/Object;

    move-result-object p0

    invoke-static {}, Ln8/b;->e()Ljava/lang/Object;

    move-result-object p1

    if-ne p0, p1, :cond_15

    return-object p0

    :cond_15
    sget-object p0, Lh8/A;->a:Lh8/A;

    return-object p0
.end method
