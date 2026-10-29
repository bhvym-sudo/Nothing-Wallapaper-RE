.class public final LG7/s$d;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LG7/s;->d(Lb/j;Landroidx/lifecycle/x;Landroid/view/ViewGroup;)LG7/s$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic r:Lv8/a;

.field final synthetic s:Lb/j;


# direct methods
.method public constructor <init>(Lv8/a;Lb/j;)V
    .registers 3

    iput-object p1, p0, LG7/s$d;->r:Lv8/a;

    iput-object p2, p0, LG7/s$d;->s:Lb/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()LZ0/a;
    .registers 2

    iget-object v0, p0, LG7/s$d;->r:Lv8/a;

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
    iget-object p0, p0, LG7/s$d;->s:Lb/j;

    invoke-virtual {p0}, Lb/j;->getDefaultViewModelCreationExtras()LZ0/a;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LG7/s$d;->a()LZ0/a;

    move-result-object p0

    return-object p0
.end method
