.class public final Lg7/k$h;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg7/k;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic r:Lv8/a;

.field final synthetic s:Landroidx/fragment/app/q;


# direct methods
.method public constructor <init>(Lv8/a;Landroidx/fragment/app/q;)V
    .registers 3

    iput-object p1, p0, Lg7/k$h;->r:Lv8/a;

    iput-object p2, p0, Lg7/k$h;->s:Landroidx/fragment/app/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LZ0/a;
    .registers 2

    iget-object v0, p0, Lg7/k$h;->r:Lv8/a;

    if-eqz v0, :cond_e

    invoke-interface {v0}, Lv8/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LZ0/a;

    if-nez v0, :cond_d

    goto :goto_e

    :cond_d
    return-object v0

    :cond_e
    :goto_e
    iget-object p0, p0, Lg7/k$h;->s:Landroidx/fragment/app/q;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Lb/j;->getDefaultViewModelCreationExtras()LZ0/a;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Lg7/k$h;->a()LZ0/a;

    move-result-object p0

    return-object p0
.end method
