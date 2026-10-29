.class public final Ll7/r$d;
.super Lkotlin/jvm/internal/o;
.source "SourceFile"

# interfaces
.implements Lv8/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ll7/r;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic r:Landroidx/fragment/app/q;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/q;)V
    .registers 2

    iput-object p1, p0, Ll7/r$d;->r:Landroidx/fragment/app/q;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/o;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a()Landroidx/lifecycle/e0;
    .registers 1

    iget-object p0, p0, Ll7/r$d;->r:Landroidx/fragment/app/q;

    invoke-virtual {p0}, Landroidx/fragment/app/q;->requireActivity()Landroidx/fragment/app/v;

    move-result-object p0

    invoke-virtual {p0}, Lb/j;->getViewModelStore()Landroidx/lifecycle/e0;

    move-result-object p0

    return-object p0
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .registers 1

    invoke-virtual {p0}, Ll7/r$d;->a()Landroidx/lifecycle/e0;

    move-result-object p0

    return-object p0
.end method
