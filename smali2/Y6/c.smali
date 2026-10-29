.class public final LY6/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY6/c;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LY6/c;

    invoke-direct {v0}, LY6/c;-><init>()V

    sput-object v0, LY6/c;->a:LY6/c;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)LP8/z;
    .registers 7

    const-string p0, "context"

    invoke-static {p1, p0}, Lkotlin/jvm/internal/n;->h(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p0, Ld9/a;

    new-instance v0, LY6/b;

    const-string v1, "NTWallpaper_Http"

    invoke-direct {v0, p1, v1}, LY6/b;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Ld9/a;-><init>(Ld9/a$b;)V

    sget-object v0, Lcom/nothing/wallpaper/common/log/c;->a:Lcom/nothing/wallpaper/common/log/c;

    invoke-virtual {v0}, Lcom/nothing/wallpaper/common/log/c;->m()Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v0, Ld9/a$a;->t:Ld9/a$a;

    invoke-virtual {p0, v0}, Ld9/a;->d(Ld9/a$a;)Ld9/a;

    goto :goto_24

    :cond_1f
    sget-object v0, Ld9/a$a;->s:Ld9/a$a;

    invoke-virtual {p0, v0}, Ld9/a;->d(Ld9/a$a;)Ld9/a;

    :goto_24
    new-instance v0, LP8/z$a;

    invoke-direct {v0}, LP8/z$a;-><init>()V

    const-wide/16 v1, 0x10

    invoke-static {v1, v2}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    move-result-object v3

    const-string v4, "ofSeconds(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, LP8/z$a;->J(Ljava/time/Duration;)LP8/z$a;

    move-result-object v0

    invoke-static {v1, v2}, Ljava/time/Duration;->ofSeconds(J)Ljava/time/Duration;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/n;->g(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, LP8/z$a;->d(Ljava/time/Duration;)LP8/z$a;

    move-result-object v0

    invoke-virtual {v0, p0}, LP8/z$a;->a(LP8/w;)LP8/z$a;

    move-result-object p0

    new-instance v0, LY6/a;

    invoke-direct {v0, p1}, LY6/a;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, LP8/z$a;->a(LP8/w;)LP8/z$a;

    move-result-object p0

    invoke-virtual {p0}, LP8/z$a;->b()LP8/z;

    move-result-object p0

    return-object p0
.end method
