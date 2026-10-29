.class public final synthetic Lq7/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lq7/l;


# direct methods
.method public synthetic constructor <init>(Lq7/l;)V
    .registers 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq7/f;->q:Lq7/l;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 2

    iget-object p0, p0, Lq7/f;->q:Lq7/l;

    invoke-static {p0, p1}, Lq7/l;->F0(Lq7/l;Landroid/view/View;)V

    return-void
.end method
