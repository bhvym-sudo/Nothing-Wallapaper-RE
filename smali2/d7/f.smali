.class public final synthetic Ld7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Li7/d;

.field public final synthetic r:Lkotlin/jvm/internal/E;


# direct methods
.method public synthetic constructor <init>(Li7/d;Lkotlin/jvm/internal/E;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/f;->q:Li7/d;

    iput-object p2, p0, Ld7/f;->r:Lkotlin/jvm/internal/E;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Ld7/f;->q:Li7/d;

    iget-object p0, p0, Ld7/f;->r:Lkotlin/jvm/internal/E;

    invoke-static {v0, p0, p1}, Ld7/l;->a(Li7/d;Lkotlin/jvm/internal/E;Landroid/view/View;)V

    return-void
.end method
