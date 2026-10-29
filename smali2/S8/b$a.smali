.class public final LS8/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LS8/b;
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
    invoke-direct {p0}, LS8/b$a;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(LP8/D;LP8/B;)Z
    .registers 6

    const-string p0, "response"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "request"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, LP8/D;->j()I

    move-result p0

    const/16 v0, 0xc8

    const/4 v1, 0x0

    if-eq p0, v0, :cond_65

    const/16 v0, 0x19a

    if-eq p0, v0, :cond_65

    const/16 v0, 0x19e

    if-eq p0, v0, :cond_65

    const/16 v0, 0x1f5

    if-eq p0, v0, :cond_65

    const/16 v0, 0xcb

    if-eq p0, v0, :cond_65

    const/16 v0, 0xcc

    if-eq p0, v0, :cond_65

    const/16 v0, 0x133

    if-eq p0, v0, :cond_3b

    const/16 v0, 0x134

    if-eq p0, v0, :cond_65

    const/16 v0, 0x194

    if-eq p0, v0, :cond_65

    const/16 v0, 0x195

    if-eq p0, v0, :cond_65

    packed-switch p0, :pswitch_data_7c

    return v1

    :cond_3b
    :pswitch_3b
    const-string p0, "Expires"

    const/4 v0, 0x2

    const/4 v2, 0x0

    invoke-static {p1, p0, v2, v0, v2}, LP8/D;->G(LP8/D;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_65

    invoke-virtual {p1}, LP8/D;->b()LP8/d;

    move-result-object p0

    invoke-virtual {p0}, LP8/d;->c()I

    move-result p0

    const/4 v0, -0x1

    if-ne p0, v0, :cond_65

    invoke-virtual {p1}, LP8/D;->b()LP8/d;

    move-result-object p0

    invoke-virtual {p0}, LP8/d;->b()Z

    move-result p0

    if-nez p0, :cond_65

    invoke-virtual {p1}, LP8/D;->b()LP8/d;

    move-result-object p0

    invoke-virtual {p0}, LP8/d;->a()Z

    move-result p0

    if-nez p0, :cond_65

    return v1

    :cond_65
    :pswitch_65
    invoke-virtual {p1}, LP8/D;->b()LP8/d;

    move-result-object p0

    invoke-virtual {p0}, LP8/d;->h()Z

    move-result p0

    if-nez p0, :cond_7b

    invoke-virtual {p2}, LP8/B;->b()LP8/d;

    move-result-object p0

    invoke-virtual {p0}, LP8/d;->h()Z

    move-result p0

    if-nez p0, :cond_7b

    const/4 p0, 0x1

    return p0

    :cond_7b
    return v1

    :pswitch_data_7c
    .packed-switch 0x12c
        :pswitch_65
        :pswitch_65
        :pswitch_3b
    .end packed-switch
.end method
