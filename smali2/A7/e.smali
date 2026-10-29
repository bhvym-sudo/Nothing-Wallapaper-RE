.class public final LA7/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LA7/e;

.field private static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .registers 14

    new-instance v0, LA7/e;

    invoke-direct {v0}, LA7/e;-><init>()V

    sput-object v0, LA7/e;->a:LA7/e;

    new-instance v1, LO1/b;

    sget-object v4, LN1/a;->q:LN1/a;

    sget-object v8, LA7/a;->q:LA7/a;

    const/16 v10, 0xbc

    const/4 v11, 0x0

    const-string v2, "GENERAL"

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v11}, LO1/b;-><init>(Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILkotlin/jvm/internal/h;)V

    move-object v0, v8

    const-string v2, "GENERAL"

    invoke-static {v2, v1}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v1

    new-instance v2, LO1/b;

    sget-object v9, LA7/a;->r:LA7/a;

    const/16 v11, 0xbc

    const/4 v12, 0x0

    move-object v4, v3

    const-string v3, "GRAPHIC"

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v12}, LO1/b;-><init>(Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILkotlin/jvm/internal/h;)V

    move-object v3, v4

    const-string v4, "GRAPHIC"

    invoke-static {v4, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v13

    new-instance v2, LO1/b;

    move-object v4, v3

    const-string v3, "OLD_QUICKLOOK"

    move-object v9, v0

    invoke-direct/range {v2 .. v12}, LO1/b;-><init>(Ljava/lang/String;LN1/a;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;LO2/f;LA7/a;LA7/g;ILkotlin/jvm/internal/h;)V

    const-string v0, "OLD_QUICKLOOK"

    invoke-static {v0, v2}, Lh8/v;->a(Ljava/lang/Object;Ljava/lang/Object;)Lh8/o;

    move-result-object v0

    filled-new-array {v1, v13, v0}, [Lh8/o;

    move-result-object v0

    invoke-static {v0}, Li8/N;->i([Lh8/o;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, LA7/e;->b:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .registers 1

    sget-object p0, LA7/e;->b:Ljava/util/Map;

    return-object p0
.end method
