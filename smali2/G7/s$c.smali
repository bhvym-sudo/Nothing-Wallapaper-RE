.class public final LG7/s$c;
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
.field final synthetic r:Lb/j;


# direct methods
.method public constructor <init>(Lb/j;)V
    .registers 2

    iput-object p1, p0, LG7/s$c;->r:Lb/j;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/e0;
    .registers 1

    iget-object p0, p0, LG7/s$c;->r:Lb/j;

    invoke-virtual {p0}, Lb/j;->getViewModelStore()Landroidx/lifecycle/e0;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, LG7/s$c;->a()Landroidx/lifecycle/e0;

    move-result-object p0

    return-object p0
.end method
