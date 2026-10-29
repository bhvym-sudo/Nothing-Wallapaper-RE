.class public abstract LP8/C;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/C$a;
    }
.end annotation


# static fields
.field public static final a:LP8/C$a;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/C$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/C$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/C;->a:LP8/C$a;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final c(LP8/x;Le9/h;)LP8/C;
    .registers 3

    sget-object v0, LP8/C;->a:LP8/C$a;

    invoke-virtual {v0, p0, p1}, LP8/C$a;->a(LP8/x;Le9/h;)LP8/C;

    move-result-object p0

    return-object p0
.end method

.method public static final d(LP8/x;[B)LP8/C;
    .registers 3

    sget-object v0, LP8/C;->a:LP8/C$a;

    invoke-virtual {v0, p0, p1}, LP8/C$a;->b(LP8/x;[B)LP8/C;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract a()J
.end method

.method public abstract b()LP8/x;
.end method

.method public e()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public f()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public abstract g(Le9/f;)V
.end method
