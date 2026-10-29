.class final Lg9/s$o;
.super Lg9/s;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "o"
.end annotation


# static fields
.field static final a:Lg9/s$o;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lg9/s$o;

    invoke-direct {v0}, Lg9/s$o;-><init>()V

    sput-object v0, Lg9/s$o;->a:Lg9/s$o;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Lg9/s;-><init>()V

    return-void
.end method


# virtual methods
.method bridge synthetic a(Lg9/v;Ljava/lang/Object;)V
    .registers 3

    check-cast p2, LP8/y$c;

    invoke-virtual {p0, p1, p2}, Lg9/s$o;->d(Lg9/v;LP8/y$c;)V

    return-void
.end method

.method d(Lg9/v;LP8/y$c;)V
    .registers 3

    if-eqz p2, :cond_5

    invoke-virtual {p1, p2}, Lg9/v;->e(LP8/y$c;)V

    :cond_5
    return-void
.end method
