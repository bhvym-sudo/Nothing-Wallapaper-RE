.class public abstract Lp7/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lp7/c$a;,
        Lp7/c$b;,
        Lp7/c$c;,
        Lp7/c$d;
    }
.end annotation


# static fields
.field public static final s:Lp7/c$a;


# instance fields
.field private final q:Z

.field private final r:Z


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lp7/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lp7/c$a;-><init>(Lkotlin/jvm/internal/h;)V

    sput-object v0, Lp7/c;->s:Lp7/c$a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/h;)V
    .registers 2

    .line 1
    invoke-direct {p0}, Lp7/c;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lp7/c;
    .registers 8

    new-instance v0, Lp7/c$b;

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public b()Lp7/c;
    .registers 8

    new-instance v0, Lp7/c$b;

    const/16 v5, 0xd

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x4

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lp7/c$b;-><init>(ZIZZILkotlin/jvm/internal/h;)V

    return-object v0
.end method

.method public c(ZZ)Lp7/c;
    .registers 3

    if-nez p1, :cond_7

    if-nez p2, :cond_7

    sget-object p0, Lp7/c$c;->t:Lp7/c$c;

    return-object p0

    :cond_7
    new-instance p0, Lp7/c$d;

    invoke-direct {p0, p2, p1}, Lp7/c$d;-><init>(ZZ)V

    return-object p0
.end method

.method public d()Z
    .registers 1

    iget-boolean p0, p0, Lp7/c;->r:Z

    return p0
.end method

.method public e()Z
    .registers 1

    iget-boolean p0, p0, Lp7/c;->q:Z

    return p0
.end method

.method public f()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public g()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final j()I
    .registers 2

    invoke-virtual {p0}, Lp7/c;->e()Z

    move-result v0

    if-eqz v0, :cond_e

    invoke-virtual {p0}, Lp7/c;->d()Z

    move-result v0

    if-eqz v0, :cond_e

    const/4 p0, 0x2

    return p0

    :cond_e
    invoke-virtual {p0}, Lp7/c;->e()Z

    move-result p0

    if-eqz p0, :cond_16

    const/4 p0, 0x1

    return p0

    :cond_16
    const/4 p0, 0x0

    return p0
.end method
