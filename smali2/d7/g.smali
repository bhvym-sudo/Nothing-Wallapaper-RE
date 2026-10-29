.class public final synthetic Ld7/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lkotlin/jvm/internal/E;

.field public final synthetic r:Li7/d;

.field public final synthetic s:Le3/Z;

.field public final synthetic t:Landroid/content/Context;

.field public final synthetic u:Lkotlin/jvm/internal/E;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/E;Li7/d;Le3/Z;Landroid/content/Context;Lkotlin/jvm/internal/E;)V
    .registers 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/g;->q:Lkotlin/jvm/internal/E;

    iput-object p2, p0, Ld7/g;->r:Li7/d;

    iput-object p3, p0, Ld7/g;->s:Le3/Z;

    iput-object p4, p0, Ld7/g;->t:Landroid/content/Context;

    iput-object p5, p0, Ld7/g;->u:Lkotlin/jvm/internal/E;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 8

    iget-object v0, p0, Ld7/g;->q:Lkotlin/jvm/internal/E;

    iget-object v1, p0, Ld7/g;->r:Li7/d;

    iget-object v2, p0, Ld7/g;->s:Le3/Z;

    iget-object v3, p0, Ld7/g;->t:Landroid/content/Context;

    iget-object v4, p0, Ld7/g;->u:Lkotlin/jvm/internal/E;

    move-object v5, p1

    invoke-static/range {v0 .. v5}, Ld7/l;->g(Lkotlin/jvm/internal/E;Li7/d;Le3/Z;Landroid/content/Context;Lkotlin/jvm/internal/E;Landroid/view/View;)V

    return-void
.end method
