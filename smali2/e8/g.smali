.class public Le8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le8/b;


# static fields
.field public static h:I = -0x1

.field public static i:I = -0x1


# instance fields
.field private a:Landroid/os/Vibrator;

.field private b:Landroid/content/Context;

.field private c:Ljava/lang/Class;

.field private d:Ljava/lang/String;

.field private e:Ljava/util/concurrent/atomic/AtomicInteger;

.field private f:Z

.field private g:I


# direct methods
.method static constructor <clinit>()V
    .registers 0

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .registers 4

    const-string v0, "RichTapPerformer"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object v1, p0, Le8/g;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    const/16 v1, 0xff

    iput v1, p0, Le8/g;->g:I

    iput-object p1, p0, Le8/g;->b:Landroid/content/Context;

    const-string v1, "vibrator"

    invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/Vibrator;

    iput-object p1, p0, Le8/g;->a:Landroid/os/Vibrator;

    const/4 p1, 0x0

    :try_start_1d
    const-string v1, "richtap.os.PhonyVibrationEffect"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Le8/g;->c:Ljava/lang/Class;
    :try_end_25
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1d .. :try_end_25} :catch_26

    goto :goto_2d

    :catch_26
    iput-object p1, p0, Le8/g;->c:Ljava/lang/Class;

    const-string v1, "failed to reflect class: \"richtap.os.PhonyVibrationEffect\"!"

    invoke-static {v0, v1}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :goto_2d
    iget-object v1, p0, Le8/g;->c:Ljava/lang/Class;

    if-nez v1, :cond_41

    :try_start_31
    const-string v1, "android.os.RichTapVibrationEffect"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    iput-object v1, p0, Le8/g;->c:Ljava/lang/Class;
    :try_end_39
    .catch Ljava/lang/ClassNotFoundException; {:try_start_31 .. :try_end_39} :catch_3a

    goto :goto_41

    :catch_3a
    iput-object p1, p0, Le8/g;->c:Ljava/lang/Class;

    const-string p1, "failed to reflect class: \"android.os.RichTapVibrationEffect\"!"

    invoke-static {v0, p1}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_41
    :goto_41
    iget-object p1, p0, Le8/g;->c:Ljava/lang/Class;

    if-nez p1, :cond_53

    :try_start_45
    const-string p1, "android.os.VibrationEffect"

    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    iput-object p1, p0, Le8/g;->c:Ljava/lang/Class;
    :try_end_4d
    .catch Ljava/lang/ClassNotFoundException; {:try_start_45 .. :try_end_4d} :catch_4e

    goto :goto_53

    :catch_4e
    const-string p1, "failed to reflect class: \"android.os.VibrationEffect\"!"

    invoke-static {v0, p1}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_53
    :goto_53
    invoke-direct {p0}, Le8/g;->g()V

    return-void
.end method

.method private e(III)V
    .registers 8

    sget v0, Le8/g;->h:I

    const-string v1, "RichTapPerformer"

    if-gtz v0, :cond_1d

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "applyPatternHeParam, CORE_MAJOR_VERSION:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget p1, Le8/g;->h:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1d
    :try_start_1d
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "applyPatternHeParam, interval:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", amplitude:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ",freq:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Le8/g;->c:Ljava/lang/Class;
    :try_end_43
    .catchall {:try_start_1d .. :try_end_43} :catchall_6c

    const-string v2, "createPatternHeParameter"

    :try_start_45
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v3, v3, v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {v0, p2, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/VibrationEffect;

    iget-object p0, p0, Le8/g;->a:Landroid/os/Vibrator;

    invoke-virtual {p0, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_6b
    .catchall {:try_start_45 .. :try_end_6b} :catchall_6c

    return-void

    :catchall_6c
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    const-string p0, "The system doesn\'t integrate RichTap software"

    invoke-static {v1, p0}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static f()Z
    .registers 5

    const-string v0, "RichTapPerformer"

    const/4 v1, 0x0

    const/4 v2, 0x0

    :try_start_4
    const-string v3, "richtap.os.PhonyVibrationEffect"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3
    :try_end_a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_a} :catch_d
    .catchall {:try_start_4 .. :try_end_a} :catchall_b

    goto :goto_13

    :catchall_b
    move-exception v0

    goto :goto_4a

    :catch_d
    :try_start_d
    const-string v3, "failed to reflect class: \"richtap.os.PhonyVibrationEffect\"!"

    invoke-static {v0, v3}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_12
    .catchall {:try_start_d .. :try_end_12} :catchall_b

    move-object v3, v1

    :goto_13
    if-nez v3, :cond_22

    :try_start_15
    const-string v3, "android.os.RichTapVibrationEffect"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3
    :try_end_1b
    .catch Ljava/lang/ClassNotFoundException; {:try_start_15 .. :try_end_1b} :catch_1c
    .catchall {:try_start_15 .. :try_end_1b} :catchall_b

    goto :goto_22

    :catch_1c
    :try_start_1c
    const-string v3, "failed to reflect class: \"android.os.RichTapVibrationEffect\"!"

    invoke-static {v0, v3}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_21
    .catchall {:try_start_1c .. :try_end_21} :catchall_b

    move-object v3, v1

    :cond_22
    :goto_22
    if-nez v3, :cond_30

    :try_start_24
    const-string v4, "android.os.VibrationEffect"

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3
    :try_end_2a
    .catch Ljava/lang/ClassNotFoundException; {:try_start_24 .. :try_end_2a} :catch_2b
    .catchall {:try_start_24 .. :try_end_2a} :catchall_b

    goto :goto_30

    :catch_2b
    :try_start_2b
    const-string v4, "failed to reflect class: \"android.os.VibrationEffect\"!"

    invoke-static {v0, v4}, Ld8/d$a;->c(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_30
    .catchall {:try_start_2b .. :try_end_30} :catchall_b

    :cond_30
    :goto_30
    const-string v0, "checkIfRichTapSupport"

    :try_start_32
    new-array v4, v2, [Ljava/lang/Class;

    invoke-virtual {v3, v0, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v3, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0
    :try_end_44
    .catchall {:try_start_32 .. :try_end_44} :catchall_b

    const/4 v1, 0x2

    if-ne v1, v0, :cond_48

    return v2

    :cond_48
    const/4 v0, 0x1

    return v0

    :goto_4a
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    return v2
.end method

.method private g()V
    .registers 5

    :try_start_0
    iget-object v0, p0, Le8/g;->b:Landroid/content/Context;
    :try_end_2
    .catchall {:try_start_0 .. :try_end_2} :catchall_77

    const-string v1, "RichTapPerformer"

    if-eqz v0, :cond_71

    :try_start_6
    iget-object v0, p0, Le8/g;->a:Landroid/os/Vibrator;

    if-nez v0, :cond_b

    goto :goto_71

    :cond_b
    iget-object p0, p0, Le8/g;->c:Ljava/lang/Class;
    :try_end_d
    .catchall {:try_start_6 .. :try_end_d} :catchall_77

    const-string v0, "checkIfRichTapSupport"

    const/4 v2, 0x0

    :try_start_10
    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {p0, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object p0

    new-array v0, v2, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "getRichTapCoreMajorVersion check framework RichTap version:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-ne v0, p0, :cond_3b

    goto :goto_7b

    :cond_3b
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "clientCode:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/high16 v2, 0xff0000

    and-int/2addr v2, p0

    shr-int/lit8 v2, v2, 0x10

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " majorVersion:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const v2, 0xff00

    and-int/2addr v2, p0

    shr-int/lit8 v2, v2, 0x8

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " minorVersion:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    and-int/lit16 p0, p0, 0xff

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    sput v2, Le8/g;->h:I

    sput p0, Le8/g;->i:I

    return-void

    :cond_71
    :goto_71
    const-string p0, "getRichTapCoreMajorVersion mContext or mVibrator null"

    invoke-static {v1, p0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_76
    .catchall {:try_start_10 .. :try_end_76} :catchall_77

    return-void

    :catchall_77
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    :goto_7b
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .registers 16

    iget-object v0, p0, Le8/g;->d:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    invoke-static {v0}, Ld8/c;->a(Ljava/lang/String;)[I

    move-result-object v0

    goto :goto_b

    :cond_a
    move-object v0, v1

    :goto_b
    sget v2, Le8/g;->h:I

    const-string v3, "RichTapPerformer"

    if-gtz v2, :cond_28

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "start(), mRichTapCoreMajorVersion:"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget p1, Le8/g;->h:I

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Ld8/d$a;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_28
    const/16 v4, 0x17

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-lt v4, v2, :cond_35

    invoke-static {p1, v6}, Ld8/b;->g(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p1

    move v8, v6

    :goto_33
    move-object v7, p1

    goto :goto_37

    :cond_35
    move v8, v5

    goto :goto_33

    :goto_37
    const/4 p1, 0x0

    if-eqz v0, :cond_45

    array-length v2, v0

    if-eq v5, v2, :cond_3e

    goto :goto_45

    :cond_3e
    aget v2, v0, p1

    aget v0, v0, v6

    :goto_42
    move v12, v0

    move v11, v2

    goto :goto_54

    :cond_45
    :goto_45
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v2

    iget-object v0, p0, Le8/g;->e:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    const v4, 0x7fffffff

    rem-int/2addr v0, v4

    goto :goto_42

    :goto_54
    sget v9, Le8/g;->h:I

    sget v10, Le8/g;->i:I

    iget-boolean v13, p0, Le8/g;->f:Z

    invoke-static/range {v7 .. v13}, Ld8/b;->j(Ljava/lang/String;IIIIIZ)[I

    move-result-object v0

    :try_start_5e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "start() mGain:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v4, p0, Le8/g;->g:I

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " raw data:"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/util/Arrays;->toString([I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Le8/g;->c:Ljava/lang/Class;
    :try_end_82
    .catchall {:try_start_5e .. :try_end_82} :catchall_b2

    const-string v4, "createPatternHeWithParam"

    :try_start_84
    const-class v5, [I

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    filled-new-array {v5, v7, v7, v7, v7}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget v6, p0, Le8/g;->g:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v0, v4, v5, v6, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v2, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/VibrationEffect;

    iget-object p0, p0, Le8/g;->a:Landroid/os/Vibrator;

    invoke-virtual {p0, p1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_b1
    .catchall {:try_start_84 .. :try_end_b1} :catchall_b2

    return-void

    :catchall_b2
    move-exception v0

    move-object p0, v0

    const-string p1, "The system doesn\'t integrate richTap software"

    invoke-static {v3, p1}, Ld8/d$a;->d(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .registers 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "setSenderIdKey:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RichTapPerformer"

    invoke-static {v1, v0}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    iput-object p1, p0, Le8/g;->d:Ljava/lang/String;

    return-void
.end method

.method public d()I
    .registers 1

    sget p0, Le8/g;->h:I

    return p0
.end method

.method public stop()V
    .registers 3

    const-string v0, "RichTapPerformer"

    const-string v1, "stop()"

    invoke-static {v0, v1}, Ld8/d$a;->a(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0, v0, v0}, Le8/g;->e(III)V

    return-void
.end method
