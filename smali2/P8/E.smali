.class public abstract LP8/E;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LP8/E$a;,
        LP8/E$b;
    }
.end annotation


# static fields
.field public static final r:LP8/E$b;


# instance fields
.field private q:Ljava/io/Reader;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, LP8/E$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LP8/E$b;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, LP8/E;->r:LP8/E$b;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b()Ljava/nio/charset/Charset;
    .registers 2

    invoke-virtual {p0}, LP8/E;->g()LP8/x;

    move-result-object p0

    if-eqz p0, :cond_10

    sget-object v0, LE8/d;->b:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v0}, LP8/x;->c(Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;

    move-result-object p0

    if-nez p0, :cond_f

    goto :goto_10

    :cond_f
    return-object p0

    :cond_10
    :goto_10
    sget-object p0, LE8/d;->b:Ljava/nio/charset/Charset;

    return-object p0
.end method

.method public static final j(LP8/x;JLe9/g;)LP8/E;
    .registers 5

    sget-object v0, LP8/E;->r:LP8/E$b;

    invoke-virtual {v0, p0, p1, p2, p3}, LP8/E$b;->a(LP8/x;JLe9/g;)LP8/E;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a()Ljava/io/Reader;
    .registers 4

    iget-object v0, p0, LP8/E;->q:Ljava/io/Reader;

    if-nez v0, :cond_13

    new-instance v0, LP8/E$a;

    invoke-virtual {p0}, LP8/E;->u()Le9/g;

    move-result-object v1

    invoke-direct {p0}, LP8/E;->b()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LP8/E$a;-><init>(Le9/g;Ljava/nio/charset/Charset;)V

    iput-object v0, p0, LP8/E;->q:Ljava/io/Reader;

    :cond_13
    return-object v0
.end method

.method public close()V
    .registers 1

    invoke-virtual {p0}, LP8/E;->u()Le9/g;

    move-result-object p0

    invoke-static {p0}, LQ8/d;->m(Ljava/io/Closeable;)V

    return-void
.end method

.method public abstract f()J
.end method

.method public abstract g()LP8/x;
.end method

.method public abstract u()Le9/g;
.end method
