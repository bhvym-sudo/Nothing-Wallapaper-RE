.class public final Lw6/c$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw6/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lw6/c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lw6/c;
    .registers 4

    const-string p0, "str"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, LE8/i;->f0(Ljava/lang/CharSequence;)Z

    move-result p0

    const/4 v0, 0x0

    if-eqz p0, :cond_d

    return-object v0

    :cond_d
    :try_start_d
    new-instance p0, Lorg/json/JSONObject;

    invoke-direct {p0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string p1, "scope"

    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, LC6/j;->e:LC6/j$a;

    invoke-virtual {v1, p1}, LC6/j$a;->a(Ljava/lang/String;)LC6/j;

    move-result-object p1

    if-nez p1, :cond_21

    return-object v0

    :cond_21
    const-string v1, "params"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_37

    invoke-static {p0}, LE8/i;->f0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_30

    goto :goto_37

    :cond_30
    sget-object v1, LE6/a$a;->b:LE6/a$a$a;

    invoke-virtual {v1, p0}, LE6/a$a$a;->a(Ljava/lang/String;)LE6/a$a;

    move-result-object p0

    goto :goto_38

    :cond_37
    :goto_37
    move-object p0, v0

    :goto_38
    new-instance v1, Lw6/c;

    invoke-direct {v1, p1, p0}, Lw6/c;-><init>(LC6/j;LE6/a$a;)V
    :try_end_3d
    .catch Lorg/json/JSONException; {:try_start_d .. :try_end_3d} :catch_3e

    return-object v1

    :catch_3e
    return-object v0
.end method
