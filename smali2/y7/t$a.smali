.class public final Ly7/t$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly7/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Ly7/t$a;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    new-instance v0, Ly7/t$a;

    invoke-direct {v0}, Ly7/t$a;-><init>()V

    sput-object v0, Ly7/t$a;->a:Ly7/t$a;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/ViewParent;)Ly7/t;
    .registers 4

    instance-of v0, p1, Ly7/t;

    if-eqz v0, :cond_7

    check-cast p1, Ly7/t;

    return-object p1

    :cond_7
    const/4 v0, 0x0

    if-eqz p1, :cond_f

    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    goto :goto_10

    :cond_f
    move-object v1, v0

    :goto_10
    if-eqz v1, :cond_1b

    invoke-interface {p1}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    invoke-virtual {p0, p1}, Ly7/t$a;->a(Landroid/view/ViewParent;)Ly7/t;

    move-result-object p0

    return-object p0

    :cond_1b
    return-object v0
.end method
