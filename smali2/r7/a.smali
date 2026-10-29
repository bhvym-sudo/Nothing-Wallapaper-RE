.class public final synthetic Lr7/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic q:Lv8/a;

.field public final synthetic r:Lr7/c;


# direct methods
.method public synthetic constructor <init>(Lv8/a;Lr7/c;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr7/a;->q:Lv8/a;

    iput-object p2, p0, Lr7/a;->r:Lr7/c;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .registers 3

    iget-object v0, p0, Lr7/a;->q:Lv8/a;

    iget-object p0, p0, Lr7/a;->r:Lr7/c;

    invoke-static {v0, p0, p1}, Lr7/c;->G(Lv8/a;Lr7/c;Landroid/view/View;)V

    return-void
.end method
