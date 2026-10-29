.class final LD8/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD8/h;
.implements LD8/c;


# static fields
.field public static final a:LD8/d;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, LD8/d;

    invoke-direct {v0}, LD8/d;-><init>()V

    sput-object v0, LD8/d;->a:LD8/d;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(I)LD8/h;
    .registers 2

    invoke-virtual {p0, p1}, LD8/d;->d(I)LD8/d;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic b(I)LD8/h;
    .registers 2

    invoke-virtual {p0, p1}, LD8/d;->c(I)LD8/d;

    move-result-object p0

    return-object p0
.end method

.method public c(I)LD8/d;
    .registers 2

    sget-object p0, LD8/d;->a:LD8/d;

    return-object p0
.end method

.method public d(I)LD8/d;
    .registers 2

    sget-object p0, LD8/d;->a:LD8/d;

    return-object p0
.end method

.method public iterator()Ljava/util/Iterator;
    .registers 1

    sget-object p0, Li8/E;->q:Li8/E;

    return-object p0
.end method
