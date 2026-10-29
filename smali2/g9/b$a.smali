.class final Lg9/b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg9/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg9/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# static fields
.field static final a:Lg9/b$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Lg9/b$a;

    invoke-direct {v0}, Lg9/b$a;-><init>()V

    sput-object v0, Lg9/b$a;->a:Lg9/b$a;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .registers 2

    check-cast p1, LP8/E;

    invoke-virtual {p0, p1}, Lg9/b$a;->b(LP8/E;)LP8/E;

    move-result-object p0

    return-object p0
.end method

.method public b(LP8/E;)LP8/E;
    .registers 2

    :try_start_0
    invoke-static {p1}, Lg9/C;->a(LP8/E;)LP8/E;

    move-result-object p0
    :try_end_4
    .catchall {:try_start_0 .. :try_end_4} :catchall_8

    invoke-virtual {p1}, LP8/E;->close()V

    return-object p0

    :catchall_8
    move-exception p0

    invoke-virtual {p1}, LP8/E;->close()V

    throw p0
.end method
